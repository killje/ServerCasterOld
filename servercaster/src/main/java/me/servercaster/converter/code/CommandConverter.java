package me.servercaster.converter.code;

/**
 *
 * @author Patrick Beuks (killje) and Floris Huizinga (Flexo013)
 */
public class CommandConverter extends SpecialCodeConverter {

    public CommandConverter() {
        super(1);
    }    
    
    @Override
    protected String getKeyword() {
        return "COMMAND";
    }

    @Override
    public void doAction(String s) {
        fm.command("/" + s);
    }
}
