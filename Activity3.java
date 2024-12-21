package activities;

public class Activity3 {

	public static void main(String[] args) {
		double seconds = 1000000000;
		double earthSeconds = 523432432;
		double MercurySeconds = 0.214324352;
		double VensusSeconds = 0.46546456;
		double marsSeconds = 1.876757657;
		double JupiterSeconds = 11.324535;
		double SaturnSeconds = 28.3544543;
		double UranusSeconds = 84.2432432;
		double NeptusSeconds = 164.3545443;

		System.out.println("Age of Mercury: " + seconds / earthSeconds / MercurySeconds);
		System.out.println("Age of Earth :" + seconds / earthSeconds);
		System.out.println("Age of Venus :" + seconds / earthSeconds / VensusSeconds);
		System.out.println("Age of Jupiter :" + seconds / earthSeconds / JupiterSeconds);
		System.out.println("Age of marsSeconds :" + seconds / earthSeconds / marsSeconds);
		System.out.println("Age of Saturn :" + seconds / earthSeconds / SaturnSeconds);
		System.out.println("Age of UranusSeconds :" + seconds / earthSeconds / UranusSeconds);
		System.out.println("Age of NeptusSeconds :" + seconds / earthSeconds / NeptusSeconds);

	}

}
