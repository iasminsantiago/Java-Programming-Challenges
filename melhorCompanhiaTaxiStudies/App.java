class Challenge {
    public static String escolheTaxi(String tf1, String vqr1, String tf2, String vqr2) {
      
      // Converte as entradas de String para double para permitir cálculos matemáticos precisos
      double TF1 = Double.parseDouble(tf1);
      double VQR1 = Double.parseDouble(vqr1);
      double TF2 = Double.parseDouble(tf2);
      double VQR2 = Double.parseDouble(vqr2);
      
      // 1. Caso idêntico: se ambas as taxas (fixa e por km) forem iguais, o custo será o mesmo sempre
      if (TF1 == TF2 && VQR1 == VQR2) return "Tanto faz";
      
      // 2. Verificações de Dominância:
      // Se a Empresa 1 tem taxa fixa menor/igual E valor por km também menor/igual, ela é sempre a melhor escolha
      if (TF1 <= TF2 && VQR1 <= VQR2) return "Empresa 1";
      // Se a Empresa 2 tem taxa fixa menor/igual E valor por km também menor/igual, ela é sempre a melhor escolha
      if (TF2 <= TF1 && VQR2 <= VQR1) return "Empresa 2";
      
      // 3. Caso de Intersecção: ocorre quando uma empresa começa mais barata (menor TF), 
      // mas cobra mais por km (maior VQR). O ponto N é onde os preços se igualam.
      // Fórmula derivada de: TF1 + VQR1*N = TF2 + VQR2*N
      double N = (TF2 - TF1) / (VQR1 - VQR2);
      
      // Arredondamento para 2 casas decimais:
      // Multiplicamos por 100, arredondamos para o inteiro mais próximo e dividimos por 100.0.
      // Isso limpa dízimas infinitas e mantém o formato compatível com os testes (ex: 7.14 ou 10.0).
      String nFormatado = String.valueOf(Math.round(N * 100.0) / 100.0);
      
      // Determina qual empresa é mais barata na "largada" (distância curta) com base na taxa fixa
      String menorDistancia = TF1 < TF2 ? "Empresa 1" : "Empresa 2"; 
      
      // Determina qual empresa será mais barata no "longo prazo" com base no valor por km
      String maiorDistancia = VQR1 < VQR2 ? "Empresa 1" : "Empresa 2"; 
      
      // Monta a string final de resposta seguindo o padrão exigido pelo enunciado
      return menorDistancia + " quando a distância < " + nFormatado + 
             ", Tanto faz quando a distância = " + nFormatado + 
             ", " + maiorDistancia + " quando a distância > " + nFormatado;
    }
}
