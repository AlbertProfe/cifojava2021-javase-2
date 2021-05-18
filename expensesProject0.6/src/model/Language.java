package model;

public class Language {
	
	
	public String name;
	public String tag;
	public String create;
	public String login;
	public String language;
	public String quit;
	public String typeName;
	public String typeSurname;
	public String typeAge;
	
	public Language(String name, String tag, 
			String create, String login, String language, String quit,
			String typeName, String typeSurname, String typeAge) {
		super();
	
		this.name = name;
		this.tag = tag;
		this.create = create;
		this.login = login;
		this.language = language;
		this.quit = quit;
		this.typeName = typeName;
		this.typeSurname = typeSurname;
		this.typeAge = typeAge;
	}

	public Language(String name, String tag) {
		super();
		
		this.name = name;
		this.tag = tag;
	}
	
	public String getCreate() {
		return create;
	}
	public void setCreate(String create) {
		this.create = create;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getQuit() {
		return quit;
	}
	public void setQuit(String quit) {
		this.quit = quit;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public String getTypeSurname() {
		return typeSurname;
	}

	public void setTypeSurname(String typeSurname) {
		this.typeSurname = typeSurname;
	}

	public String getTypeAge() {
		return typeAge;
	}

	public void setTypeAge(String typeAge) {
		this.typeAge = typeAge;
	}
	

}
