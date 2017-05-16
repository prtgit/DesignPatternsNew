
public class Terminal implements ApplicationComponent { //>6
	Theme theme = new DarkTheme(); //> 7

	@Override
	public void setTheme(Theme theme) {
		this.theme = theme;
		System.out.println("Terminal : Applying theme with background color " + this.theme.backgroundColor
				+ " and font color " + this.theme.fontColor);
	}
}
