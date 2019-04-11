package com.wipro.util;

public class Person {

		private String personName;
		private int personVoterId;
		private char personGender;
		private int personAge;
		public String getPersonName() {
			return personName;
		}
		public void setPersonName(String personName) {
			this.personName = personName;
		}
		public int getPersonVoterId() {
			return personVoterId;
		}
		public void setPersonVoterId(int personVoterId) {
			this.personVoterId = personVoterId;
		}
		public char getPersonGender() {
			return personGender;
		}
		public void setPersonGender(char personGender) {
			this.personGender = personGender;
		}
		public int getPersonAge() {
			return personAge;
		}
		public void setPersonAge(int personAge) {
			this.personAge = personAge;
		}
		public Person(String personName, int personVoterId, char personGender, int personAge) {
			super();
			this.personName = personName;
			this.personVoterId = personVoterId;
			this.personGender = personGender;
			this.personAge = personAge;
		}
		public Person() {
			super();
		}
		
		
		
}

