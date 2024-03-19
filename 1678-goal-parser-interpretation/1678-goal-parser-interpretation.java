class Solution {
    public String interpret(String command) {
        command = command.replace("()","o").replace("(","").replace(")","");
        return command;
    }
}