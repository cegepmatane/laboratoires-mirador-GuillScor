package modele;

public class StatistiquesMeteores {
	protected float masseMin;
	protected float masseMax;
	protected float masseMoyenne;
	
	public StatistiquesMeteores(float masseMin, float masseMax, float masseMoyenne){
		super();
		this.masseMin = masseMin;
		this.masseMax = masseMax;
		this.masseMoyenne = masseMoyenne;
	}

	public float getMasseMin() {
		return masseMin;
	}

	public void setMasseMin(float masseMin) {
		this.masseMin = masseMin;
	}

	public float getMasseMax() {
		return masseMax;
	}

	public void setMasseMax(float masseMax) {
		this.masseMax = masseMax;
	}

	public float getMasseMoyenne() {
		return masseMoyenne;
	}

	public void setMasseMoyenne(float masseMoyenne) {
		this.masseMoyenne = masseMoyenne;
	}
	
}
