package beans;

public class Proprietaire {
	
	private String id;
	private String nom;
	private String prenom;
	private String tel;
	private String email;
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}	

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
