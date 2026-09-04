class Solution {
    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();

        for (String str : strs) {
            encoded.append(str.length())
                   .append("#")
                   .append(str);
        }

        return encoded.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();

        int i = 0;

        while (i < str.length()) {

            int j = i;

            // Buscar el #
            while (str.charAt(j) != '#') {
                j++;
            }

            // Obtener longitud
            int length = Integer.parseInt(str.substring(i, j));

            // El string empieza después de #
            int start = j + 1;

            // Extraer exactamente "length" caracteres
            String word = str.substring(start, start + length);

            result.add(word);

            // Mover i al siguiente elemento
            i = start + length;
        }

        return result;
    }
}