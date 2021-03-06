class Parser {
    /*
    rewrite using Try (method should return Try<Integer>)
     */
    static Integer parse(String number) throws CannotParseInteger {
        try {
            return Integer.parseInt(number);
        } catch (NumberFormatException e) {
            throw new CannotParseInteger(e.getMessage());
        }
    }
}
