class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder result = new StringBuilder();
        boolean capitalizeNext = false;

        for (int i = 0; i < identifier.length(); i++) {
            char ch = identifier.charAt(i);

            if (ch == ' ') {
                result.append('_');
                capitalizeNext = false;
                continue;
            }

            if (ch == '-') {
                capitalizeNext = true;
                continue;
            }

            // leetspeak conversion
            switch (ch) {
                case '4': ch = 'a'; break;
                case '3': ch = 'e'; break;
                case '0': ch = 'o'; break;
                case '1': ch = 'l'; break;
                case '7': ch = 't'; break;
                default: break;
            }

            if (capitalizeNext) {
                if (Character.isLetter(ch)) {
                    ch = Character.toUpperCase(ch);
                }
                capitalizeNext = false;
            }

            if (Character.isLetter(ch) || ch == '_') {
                result.append(ch);
            }
        }

        return result.toString();
    }
}