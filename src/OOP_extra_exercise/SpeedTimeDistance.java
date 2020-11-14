package OOP_extra_exercise;

public class SpeedTimeDistance {

	public Double Velocity;
	public Double Distance;
	public Double Time;

	public SpeedTimeDistance() {

	}

	// v = d / t
	public Double calcVelocity(Double DistanceValue, Double TimeValue) {
		return DistanceValue / TimeValue;
	}

	// d = v * t
	public Double calcDistance(Double VelocityValue, Double TimeValue) {
		return VelocityValue * TimeValue;
	}

	// t = d / v
	public Double calcTime(Double DistanceValue, Double ValocityValue) {
		return DistanceValue / ValocityValue;
	}

}
