
/**
 * @author sam Kauffman
 * @Version 0.1
 *
 */
public class BasketballTeam extends SportsTeam {
	private int mFieldGoals;
	private int mFieldGoalsAttempted;
	private int mFreeThrows;
	private int mFreeThrowAttempted;
/**
 * Empty constructor
 */
public BasketballTeam() {
	super();
	mFieldGoals = 0;
	mFieldGoalsAttempted = 0;
	mFreeThrows = 0;
	mFreeThrowAttempted = 0;
}//end of empty constructor
/**
 * @param teamName
 * @param teamMascot
 * @param headCoach
 */
public BasketballTeam(String teamName, String teamMascot, String headCoach) {
	super(teamName, teamMascot, headCoach);
}//end of BasketballTeam
/**
 * @return fieldGoalPercentage
 */
public double fieldGoalPercentage() {
	double fieldGoalPercentage;
	fieldGoalPercentage = (double)mFieldGoals/mFieldGoalsAttempted;
	return fieldGoalPercentage;
}//end of fieldGoalPercentage
/**
 * @return freeThrowPercentage
 */
public double freeThrowPercentage() {
	double freeThrowPercentage;
	freeThrowPercentage = (double)mFreeThrows/mFreeThrowAttempted;
	return freeThrowPercentage;
}//end of freeThrowPercentage
/**
 * @param mWins
 * @param mLosses
 * @param fieldGoals
 * @param FieldGoalsAttempted
 * @param freeThrows
 * @param freeThrowAttempted
 * @return array listing these stats
 */
public void setStats(int wins, int losses, int fieldGoals, int fieldGoalsAttempted, int freeThrows, int freeThrowAttempted) {
	mWins = wins;
	mLosses = losses;
	mFieldGoals = fieldGoals;
	mFieldGoalsAttempted = fieldGoalsAttempted;
	mFreeThrows = freeThrows;
	mFreeThrowAttempted = freeThrowAttempted;
	
}//end of getStats
public int getFieldGoals() {
	return mFieldGoals;
}
public void setFieldGoals(int fieldGoals) {
	if(fieldGoals < 0) {
		mFieldGoals = 0;
	}
	else {
		mFieldGoals = fieldGoals;
	}
}
public int getFieldGoalsAttempted() {
	return mFieldGoalsAttempted;
}
public void setFieldGoalsAttempted(int fieldGoalsAttempted) {
	this.mFieldGoalsAttempted = fieldGoalsAttempted;
}
public int getFreeThrows() {
	return mFreeThrows;
}
public void setFreeThrows(int freeThrows) {
	if(freeThrows < 0) {
		mFreeThrows = 0;
	}
	else {
		mFreeThrows = freeThrows;
	}
}
public int getFreeThrowsAttempted() {
	return mFreeThrowAttempted;
}
public void setFreeThrowsAttempted(int freeThrowAttempted) {
	if(freeThrowAttempted < 0) {
		mFreeThrowAttempted = 0;
	}
	else {
		mFreeThrowAttempted = freeThrowAttempted;
	}
}
@Override
public double[] getStats() {
	return new double[] {this.getWinPercentage(), fieldGoalPercentage(), freeThrowPercentage()};
	
}
}
