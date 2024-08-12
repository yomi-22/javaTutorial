package accessModifierTwo;

import AccessModifier.AccessModifierClass;

public class AccessModifierFromOutsidePackage extends AccessModifierClass {

    public static void main(String[] args) {
        // Only public variable and methods can be access if a class does not
        // belongs to the same package. private, protected and default can't be access from outside a class
        // that does belong to the package
        AccessModifierClass ac = new AccessModifierClass();

        // AccessModifierFromOutsidePackage can only access public variables/methods unless if the AccessModifierFromOutsidePackage extends/inherit
        // AccessModifierClass. then public and protected are accessible
        AccessModifierFromOutsidePackage am = new AccessModifierFromOutsidePackage();
        am.result = "yes";
        // ac.exist = true;
        ac.accessString = "";
        // ac.result = "";
        //ac.getAnswer();
        ac.getMessage();
        // ac.getResult();
        var get = ac.getMessage();
    }
}
