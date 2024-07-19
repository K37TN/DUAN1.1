
package Model;

import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author FPTSHOP
 */
public class Model_Menu {

    public Model_Menu() {
    }

    public Model_Menu(String icon, String name, MenuType type) {
        this.icon = icon;
        this.name = name;
        this.type = type;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MenuType getType() {
        return type;
    }

    public void setType(MenuType type) {
        this.type = type;
    }
    
    
    private String icon;
    private String name;
    private MenuType type;
    
    public Icon toIcon() {
        return new ImageIcon(getClass().getResource("/poly/edu/icons/"+icon+".png"));
    }
    
    public static enum MenuType {
        TITLE, TIME, MENU, EMPTY
    }
}
