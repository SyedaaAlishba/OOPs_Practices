public class Custom_Design {
    Turtle t = new Turtle();
    commands z = new commands();
    line l1;
    public void execute(String command){
        Turtle t = new Turtle();
        point p1 = new point(400, 300);
        point p2 = new point(p1);
        line l1 = new line(p1, p2);
        t.addLine(l1);
        for (int c = 0 ; c<command.toCharArray().length ;c++){
            char c1 = command.charAt(c);
            line lastLine = t.lines.get(t.lines.size() - 1);
            switch (c1){
                case 'F':
                    point p = z.setterForward(lastLine);
                    l1 = new line(lastLine.end, p);
                    t.lines.add(l1);
                    break;
                case '+':
                     p1 = z.setterUp(lastLine);
                    line l2 = new line(lastLine.end, p1);
                    t.lines.add(l2);
                    break;
                case '-':
                     p2 = z.setterDown(lastLine);
                    line l3 = new line(lastLine.end, p2);
                    t.lines.add(l3);
                    break;
                case'B':
                    point p3 = z.setterBackward(lastLine);
                    line l4 = new line(lastLine.end, p3);
                    t.lines.add(l4);
                    break;
                default:
                    System.out.println("**********");
            }
        }
        t.display();
    }
}
