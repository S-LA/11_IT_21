package consoleprint;

public class TestConsole {

	public static void main(String[] args) {
		ConsolePrint printer = new ConsolePrint(16, "|");
		printer.normal("Hello World");
		printer.normal("This is me");
		
		ConsolePrint printerTwo = new ConsolePrint(20, "#");
		printerTwo.normal("So you can");
		printerTwo.normal("Do this bla bla");
	}

}
