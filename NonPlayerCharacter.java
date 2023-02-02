package Lab1;

import java.util.Random;

/**
 * @author sam Kauffman
 */
public class NonPlayerCharacter extends GameCharacter {
	private boolean mActive;
	private String mIntelligenceType;
		/**
		 * empty constructor
		 */
		public NonPlayerCharacter(){
			super();
			mIntelligenceType = "AVERAGE";
			mActive = false;
		}//end empty-argument constructor
		/**
		 * @param id
		 * @param personality
		 * @param active
		 * @param intelligenceType
		 */
		public NonPlayerCharacter(String id, String personality, boolean active, String intelligenceType){
			super(id, personality);
			mActive=active;
			mIntelligenceType=intelligenceType;
		}//end full-argument constructor
		/**
		 * @param active
		 */
		public void setActive(boolean active) {
			mActive = active;
		}//end setActive
		/**
		 * @return activity
		 */
		public boolean getActive() {
			return mActive;
		}//end getActive
		/**
		 * @param intelligenceType
		 */
		public void setIntelligenceType(String intelligenceType) {
			mIntelligenceType=intelligenceType;
		}//end setIntelligenceType
		/**
		 * @return intelligence type
		 */
		public String getIntelligenceType() {
			return mIntelligenceType;
		}//end getIntelligenceType
		/**
		 * Prints player menu
		 */
		public String reportStructure(){
			
			StringBuilder sb = new StringBuilder("==================================\n");
			sb.append("UniqueID: "+getUniqueID()+"\n");
			sb.append("Personality: "+getPersonality()+"\n");
			sb.append("==================================\n");
			sb.append("Active: "+getActive()+"\n");
			sb.append("IntelligenceType: "+getIntelligenceType()+"\n");
			sb.append("==================================\n");
			
			
			return sb.toString();
		}//end reportStats
		/**
		 * @return random username
		 */
		public String introduce() {
			String NAME = "";
			Random gen = new Random();
			String array[] = new String[5];
			array[0] = "Dag Gummit";
			array[1] = "Doggone it";
			array[2] = "Holy cow";
			array[3] = "Jeez";
			array[4] = "Well cheese and crackers";
			int i = gen.nextInt(4);
			System.out.println("Hello, my name is " + array[i] + "!");
			return NAME;
			
		}//end introduce
		
}
