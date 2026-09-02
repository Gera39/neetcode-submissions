class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mapeoListas = new HashMap<>();

        for (String str : strs) {
            String ordenString = ordenChar(str);

            if (mapeoListas.containsKey(ordenString)) {
                mapeoListas.get(ordenString).add(str);

            } else {
                List<String> nuevaLista = new ArrayList<>();
                nuevaLista.add(str);

                mapeoListas.put(ordenString, nuevaLista);
            }
        }

        List<List<String>> resultado = new ArrayList<>(mapeoListas.values());

        resultado.sort(Comparator.comparingInt(List::size));

        return resultado;
    }

    public String ordenChar(String str) {
        char[] strOrdenada = str.toLowerCase().toCharArray();

        Arrays.sort(strOrdenada);

        return new String(strOrdenada);
    }
}