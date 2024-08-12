package AccessModifier;

public class GetInfo extends AccessModifierClass {

    public static void main(String[] args) {
        AccessModifierClass ac = new AccessModifierClass();

        ac.exist = true;
        ac.accessString = "";
        ac.result = "";
        ac.getAnswer();
        ac.getMessage();
        ac.getResult();

        // GetInfo class can't AccessModifierClass. However, if the GetInfo class extends/inherit
        // AccessModifierClass then it will have access to all the AccessModifierClass variables
        // methods except the private varible/method
        GetInfo info = new GetInfo();
        info.accessString = "";
        info.result = "";
        info.exist = true;

    }
}
