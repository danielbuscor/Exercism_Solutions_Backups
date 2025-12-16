class SqueakyClean {
    static String clean(String identifier) {
         StringBuilder builder = new StringBuilder();
        for (int i = 0; i < identifier.length(); i++) {
            if (Character.isLetterOrDigit(identifier.charAt(i)) || identifier.charAt(i) == ' '
            || identifier.charAt(i) == '-') {
                switch (identifier.charAt(i)) {
                    case ' ':
                        builder.append("_");
                        break;
                    case '-':
                        if (i + 1 < identifier.length()) {
                            builder.append((Character.toUpperCase(identifier.charAt(i + 1))));
                            i++;
                        }
                        break;
                    case '4':
                        builder.append('a');
                        break;
                    case '3':
                        builder.append('e');
                        break;
                    case '1':
                        builder.append('l');
                        break;
                    case '0':
                        builder.append('o');
                        break;
                    case '7':
                        builder.append('t');
                        break;
                    default:
                        builder.append(identifier.charAt(i));
                        break;
                }

            }

        }
        return builder.toString();
    }
}
