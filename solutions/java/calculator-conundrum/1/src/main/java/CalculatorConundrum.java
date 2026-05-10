class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) throws IllegalOperationException {

        if(operation == null) {
            throw new IllegalArgumentException("Operation cannot be null");
        }

        if (operation.equals("")) {
            throw new IllegalArgumentException("Operation cannot be empty");
        }
        
        if(operation.equals("+")) {
            int sum = operand1 + operand2;
            return operand1 + " + " + operand2 + " = " + sum;
        }

        if(operation.equals("*")) {
            int mult = operand1 * operand2;
            return operand1 + " * " + operand2 + " = " + mult;
        }

        if(operation.equals("/")) {
            try {
                int div = operand1 / operand2;
                return operand1 + " / " + operand2 + " = " + div;
            } catch(ArithmeticException e) {
                throw new IllegalOperationException("Division by zero is not allowed", e);
            }
        }
        
        throw new IllegalOperationException("Operation " + "'" + operation +"'" + " does not exist");
    }
}