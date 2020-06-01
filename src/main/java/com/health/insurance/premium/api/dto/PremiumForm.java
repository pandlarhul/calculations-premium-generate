package com.health.insurance.premium.api.dto;

public class PremiumForm {
	
	private String name;
	private String gender;
	private int age;
	private boolean hypertension;
	private boolean bloodPressure;
	private boolean bloodSugar;
	private boolean overWeight;

	private boolean smoking;
	private boolean alcohol;
	private boolean dailyExercise;
	private boolean drugs;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	public boolean isSmoking() {
		return smoking;
	}

	public void setSmoking(boolean smoking) {
		this.smoking = smoking;
	}

	public boolean isAlcohol() {
		return alcohol;
	}

	public void setAlcohol(boolean alcohol) {
		this.alcohol = alcohol;
	}

	public boolean isDailyExercise() {
		return dailyExercise;
	}

	public void setDailyExercise(boolean dailyExercise) {
		this.dailyExercise = dailyExercise;
	}

	public boolean isDrugs() {
		return drugs;
	}

	public void setDrugs(boolean drugs) {
		this.drugs = drugs;
	}

	public boolean isHypertension() {
		return hypertension;
	}

	public void setHypertension(boolean hypertension) {
		this.hypertension = hypertension;
	}

	public boolean isBloodPressure() {
		return bloodPressure;
	}

	public void setBloodPressure(boolean bloodPressure) {
		this.bloodPressure = bloodPressure;
	}

	public boolean isBloodSugar() {
		return bloodSugar;
	}

	public void setBloodSugar(boolean bloodSugar) {
		this.bloodSugar = bloodSugar;
	}

	public boolean isOverWeight() {
		return overWeight;
	}

	public void setOverWeight(boolean overWeight) {
		this.overWeight = overWeight;
	}

	@Override
	public String toString() {
		return "PremiumForm [name=" + name + ", gender=" + gender + ", age="
				+ age + ", smoking=" + smoking + ", alcohol=" + alcohol
				+ ", dailyExercise=" + dailyExercise + ", drugs=" + drugs
				+ ", Hypertension=" + hypertension + ", bloodPressure="
				+ bloodPressure + ", bloodSugar=" + bloodSugar
				+ ", overweight=" + overWeight + "]";
	}

}
