
public class Editor implements ApplicationComponent { //> 3
	Theme theme = new LightTheme(); //> 4

	@Override
	public void setTheme(Theme theme) { //> 5
		this.theme = theme;
		System.out.println(
				"Editor : Applying theme with background color " + this.theme.backgroundColor + " and font color " + this.theme.fontColor);
	}
}
