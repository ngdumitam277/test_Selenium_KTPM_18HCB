package webdriver2.enumaction;

public enum CheckResultEnumEnum {
	
	// action compare
	EXIST("exist","check exist"),
	NOTEXIST("not-exist","check exist"),
	EQUAL("equal","check equal"),
	NOTEQUAL("not-equal","check equal"),
	PASS("pass","test case pass"),
	FAIL("fail","test case fail"),
	EMPTY("empty","not-null"),
	NOTEMPTY("not-empty","not-null"),
	VISIBLE("visible","not-null"),
	HIDDEN("hidden","not-null");
	
 
	
	private String actionName;
	private String exapanAction;
	
	private CheckResultEnumEnum(String actionName, String explan) {
		 this.actionName=actionName;
		 this.exapanAction=explan;
	}

	public String getActionName() {
		return actionName;
	}

	public void setActionName(String actionName) {
		this.actionName = actionName;
	}

	public String getExapanAction() {
		return exapanAction;
	}

	public void setExapanAction(String exapanAction) {
		this.exapanAction = exapanAction;
	}
	
	public static CheckResultEnumEnum getCheckResultEnumEnum(String actionName) {
		for(CheckResultEnumEnum in : values()) {
			if(in.getActionName().equals(actionName)) {
				return in;
			}
		}
		return null;
	}
	
}
