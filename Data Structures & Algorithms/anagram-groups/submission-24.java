class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> resultado = new ArrayList<List<String>>();
        Set<String> listaMemoria = new HashSet<String>();
        Map<String,List<String>> mapeoListas = new HashMap<String,List<String>>();
        // Recorremos lista de string
        for (int i = 0; i < strs.length; i++) {
            String ordenString = ordenChar(strs[i]);
            if(listaMemoria.contains(ordenString)){
                List<String> listaObtenida = mapeoListas.get(ordenString);
                listaObtenida.add(strs[i]);
                mapeoListas.put(ordenString,listaObtenida);
            }else{
                listaMemoria.add(ordenString);
                mapeoListas.put(ordenString, new ArrayList<>(List.of(strs[i])));
            }
        }

    //      map.values().stream()
    // .sorted(Comparator.comparingInt(List::size))
    // .collect(Collectors.toList());
      List<List<String>> listaOrdenada = new ArrayList<>(mapeoListas.values());
listaOrdenada.sort(Comparator.comparingInt(List::size));

        return listaOrdenada;
    }

    public String ordenChar(String str) {
        char[] strOrdenada = str.toLowerCase().toCharArray();

        Arrays.sort(strOrdenada);
        
        return new String(strOrdenada);
    }
}
