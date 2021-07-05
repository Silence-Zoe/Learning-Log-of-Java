class Evaluate {
    Stack<String> ops = new Stack<String>();
    Stack<Double> vals = new Stack<Double>();

    public double calculate(String[] args) {
        for (String str : args) {
            if ("(".equals(str)) {
                ;
            } else if ("+".equals(str)) {
                ops.push(str);
            } else if ("-".equals(str)) {
                ops.push(str);
            } else if ("*".equals(str)) {
                ops.push(str);
            } else if ("/".equals(str)) {
                ops.push(str);
            } else if (str.equals(")")) {
                String op = ops.pop();
                double v = vals.pop();

                if ("+".equals(op)) {
                    v = vals.pop() + v;
                } else if ("-".equals(op)) {
                    v = vals.pop() - v;
                } else if ("*".equals(op)) {
                    v = vals.pop() * v;
                } else if ("/".equals(op)) {
                    v = vals.pop() / v;
                }
                vals.push(v);
            } else {
                vals.push(Double.parseDouble(str));
            }
        }
        return vals.pop();
    }
}