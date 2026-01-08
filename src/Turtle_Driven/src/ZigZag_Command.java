 class ZigZag_Command    {
    commands c = new commands();
    public void execute(){
        Turtle t = new Turtle();
        point p1 = new point(400, 300);
        point p2 = new point(p1);
        line l1 = new line(p1, p2);
        t.addLine(l1);

        //for forward
        line lastLine = t.lines.get(t.lines.size() - 1);
        point p = c.setterForward(lastLine);
        l1 = new line(lastLine.end, p);
        t.lines.add(l1);

//for -ve
        lastLine = t.lines.get(t.lines.size() - 1);
        point p3 = c.setterDown(lastLine);
        line l3 = new line(lastLine.end, p3);
        t.lines.add(l3);
//
//        //for ForWARD
        lastLine = t.lines.get(t.lines.size() - 1);
         p = c.setterForward(lastLine);
        l1 = new line(lastLine.end, p);
        t.lines.add(l1);
//
//        //for +
        lastLine = t.lines.get(t.lines.size() - 1);
        point p4 = c.setterUp(lastLine);
        line l2 = new line(lastLine.end, p4);
        t.lines.add(l2);
//
//        //for ForWARD
        lastLine = t.lines.get(t.lines.size() - 1);
        p = c.setterForward(lastLine);
        l1 = new line(lastLine.end, p);
        t.lines.add(l1);
//
//        //for -ve
        lastLine = t.lines.get(t.lines.size() - 1);
         p2 = c.setterDown(lastLine);
         l3 = new line(lastLine.end, p2);
        t.lines.add(l3);
//
//        //for forward
        lastLine = t.lines.get(t.lines.size() - 1);
        p = c.setterForward(lastLine);
        l1 = new line(lastLine.end, p);
        t.lines.add(l1);

        t.display();
    }
}
