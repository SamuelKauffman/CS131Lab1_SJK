
/**
 * @author sam Kauffman
 * @version 0.1
 */
abstract class SportsTeam {
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

	public String getmTeamName() {
		return mTeamName;
	}

	public void setmTeamName(String teamName) {
		this.mTeamName = teamName;
	}

	public String getTeamMascot() {
		return mTeamMascot;
	}

	public void setTeamMascot(String teamMascot) {
		this.mTeamMascot = teamMascot;
	}

	public String getHeadCoach() {
		return mHeadCoach;
	}

	public void setheadCoach(String headCoach) {
		this.mHeadCoach = headCoach;
	}

	public int getWins() {
		return mWins;
	}

	public void setWins(int wins) {
		if(wins < 0) {
			mWins = 0;
		}
		else {
			mWins = wins;
		}
	}

	public int getLosses() {
		return mLosses;
	}

	public void setLosses(int losses) {
		if(losses < 0) {
			mLosses = 0;
		}
		else {
			mLosses = losses;
		}
	}

	/**
	 * @return winPercentage
	 */
	public double getWinPercentage() {
		double winPercent;
		winPercent = (double) mWins / (mWins + mLosses);
		return winPercent;
	}

	/**
	 * @return
	 */
	public abstract double[] getStats();
}
