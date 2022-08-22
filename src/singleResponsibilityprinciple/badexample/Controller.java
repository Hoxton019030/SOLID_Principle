package singleResponsibilityprinciple.badexample;

public class Controller {
    public static void main(String[] args) {
        MySql mySqlDb = new MySql();
        mySqlDb.host();
        //如果今天改用其他的資料庫(ex:SQL Server，那這整段就要全部砍掉重寫)

    }
}
