package com.health.insurance.premium.api.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.health.insurance.premium.api.common.Constants;
import com.health.insurance.premium.api.dto.PremiumForm;
import com.health.insurance.premium.api.dto.PremiumResponse;
import com.health.insurance.premium.api.service.CalculatePremiumService;

@RequestMapping("/insurence")
@Controller
public class HealthInsurancePremiumController {
	@Autowired
	private CalculatePremiumService service;

	@GetMapping(value = "/calculatePremium")
	public String calculateTotalPremium(@ModelAttribute("premiumForm") PremiumForm premiumForm, Model model) {
		System.out.println("candidate = " + premiumForm);
		double totalPremiumAmount = 0;
//		System.out.println("call in calculate premium");
		PremiumResponse response = new PremiumResponse();
		try {
			totalPremiumAmount = service.getPremiumAmount(premiumForm);
			response.setAmount(totalPremiumAmount);
			response.setName(premiumForm.getName());
		} catch (Exception e) {
			model.addAttribute("errorMessage", Constants.HEALTH_INSURANCE_ERROR_MESSAGE);
			return "redirect:/insurence/home";
		}
		model.addAttribute("response", response);
		 premiumForm = new PremiumForm();
		model.addAttribute("premiumForm", premiumForm);
//		logger.info("Response of calculateTotalPremium() " + response.toString());
		System.out.println("amount = " + totalPremiumAmount);
		return "home-page";
	}

	@GetMapping("/home")
	public String home(Model model) {
		PremiumForm premiumForm = new PremiumForm();
		model.addAttribute("premiumForm", premiumForm);
		// System.out.println("ok clicked ----------------------->>>>>.");
		return "home-page";
	}

}
