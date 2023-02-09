package Lab2;

/**
 * @author sam Kauffman
 *@version 0.1
 */
public abstract class SportsTeam {
	protected String mTeamName;
	protected String mTeamMascot;
	protected String mHeadCoach;
	protected int mWins;
	protected int mLosses;
/**
 * empty constructor
 */
public SportsTeam() {
	mTeamName = "";
	mTeamMascot = "";
	mHeadCoach = "";
	mWins = 0;
	mLosses = 0;
}
/**
 * @param teamName
 * @param teamMascot
 * @param headCoach
 */
public SportsTeam(String teamName, String teamMascot, String headCoach) {
	mTeamName = teamName;
	mTeamMascot = teamMascot;
	mHeadCoach = headCoach;
}
/**
 * @return winPercentage
 */
public double getWinPecentage() {
	double winPercent;
	winPercent = (double)mWins/(mWins + mLosses);
	return winPercent;
}
/**
 * @return
 */
public abstract double[] getStats();
}
