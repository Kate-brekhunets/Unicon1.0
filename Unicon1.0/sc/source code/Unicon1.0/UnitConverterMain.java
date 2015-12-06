package sc.source code.Unicon1.0;

public class UnitConverterMain
{
	public static void main(String[] args)
	{
		MeasurementFactory factory = MeasurementFactory.instance();
		factory.load();

		UnitConverterGui gui = new UnitConverterGui(factory);
		gui.init();
		return;
	}
}
