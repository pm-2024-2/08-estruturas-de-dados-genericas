// Estruturas de Dados
// 3, clássicas:
// LISTA: ELEMENTOS ORDENADOS DE TAMANHO VARIÁVEL
// CONJUNTO
// MAPA (DICIONÁRIO (DICT), HASH, HASHTABLE)


class Texto {
  // método => função que pertence à uma classe ou objeto
  // "nome;end;telefone"
  //      ^   ^
  // tão abstratas quanto possível
  
  static String[] split(String str, char sep) {
    int tamanho = 1;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == sep) {
        tamanho++;
      }
    }
    // estrutura "primitiva"
    String[] partes = new String[tamanho];
    partes[0] = "";
    for (int i = 0, c = 0; i < str.length(); i++) {
      if (str.charAt(i) == sep) {
        partes[++c] = ""; // pré-incremento
      } else {
        partes[c] += str.charAt(i);
      }
    }

    return partes;
  }
}
