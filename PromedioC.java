package trabajos;

public class PromedioC {
    public static void main(String[] args) 
    {
        double c1, c2, c3;
        c1 = Double.parseDouble(javax.swing.JOptionPane.showInputDialog(null,"Primer Calificacion"));
        c2 = Double.parseDouble(javax.swing.JOptionPane.showInputDialog(null,"Segunda Calificacion"));
        c3 = Double.parseDouble(javax.swing.JOptionPane.showInputDialog(null,"Tercera Calificacion"));
	suma=(c1+c2+c3);
	promedio=(suma/3);
        javax.swing.JOptionPane.showMessageDialog(null,"Calificacion 1: " + c1 + "\nCalificacion 2: " + c2 + "\nCalificacion 3: " + c3 + "\nPromedio: " + promedio);
    }
    
}
