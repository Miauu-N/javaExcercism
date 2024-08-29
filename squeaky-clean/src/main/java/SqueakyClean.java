class SqueakyClean {
    static String clean(String identifier) {
        String replace = new String();
        identifier.trim();
        replace = identifier.replace(" ", "_");
        String[] splited = replace.split("-"); // aa-bb-cc -> {aa, Bb, Cc} -> aaBbCc
        String result = splited[0];
        int i = 0;
        for (String split : splited) {
            if (i > 0) {
                result += split.substring(0,1).toUpperCase() + split.substring(1).toLowerCase();
            }
            i++;
        }
        result = result.replace("4", "a");
        result = result.replace("3", "e");
        result = result.replace("0", "o");
        result = result.replace("1", "l");
        result = result.replace("7", "t");
        char[] charray = result.toCharArray();
        String clean = new String();
        for (char c : charray) {
            if (Character.isLetter(c) || c == '_') {
                clean += c;
            }
        }
        
        return clean;
    }
}
