public class Main {
    public static void main(String[] args) {
        Client c1 = new Client("aaa", "000.000.000-00", Client.Type.COMMON, Choice.CALL);
        Client c2 = new Client("bbb", "000.000.000-00", Client.Type.PRIORITY, Choice.CHATBOT);
        Client c3 = new Client("ccc", "000.000.000-00", Client.Type.PRIORITY, Choice.CALL);
        Client c4 = new Client("ddd", "000.000.000-00", Client.Type.PRIORITY, Choice.CHATBOT);
        Client c5 = new Client("eee", "000.000.000-00", Client.Type.COMMON, Choice.CHATBOT);
        Client c6 = new Client("fff", "000.000.000-00", Client.Type.COMMON, Choice.CALL);
        Client c7 = new Client("ggg", "000.000.000-00", Client.Type.COMMON, Choice.CALL);
        Client c8 = new Client("hhh", "000.000.000-00", Client.Type.PRIORITY, Choice.CALL);
        Client c9 = new Client("iii", "000.000.000-00", Client.Type.COMMON, Choice.CALL);
        Client c10 = new Client("jjj", "000.000.000-00", Client.Type.COMMON, Choice.CALL);
        Management m1 = new Management();
        m1.addOnCallOrChatbbot(c1);
        m1.addOnCallOrChatbbot(c2);
        m1.addOnCallOrChatbbot(c3);
        m1.addOnCallOrChatbbot(c4);
        m1.addOnCallOrChatbbot(c5);
        m1.addOnCallOrChatbbot(c6);
        m1.addOnCallOrChatbbot(c7);
        m1.addOnCallOrChatbbot(c8);
        m1.addOnCallOrChatbbot(c9);
        m1.addOnCallOrChatbbot(c10);
        System.out.println(m1);
        m1.delOnCallOrChatbot();
        System.out.println(m1);

    }
}