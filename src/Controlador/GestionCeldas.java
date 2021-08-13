
package Controlador;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class GestionCeldas extends DefaultTableCellRenderer {
    private String tipo="text";
    //se definen por defecto los tipos de datos a usar
    private Font normal = new Font( "Verdana",Font.PLAIN ,12 );
    private Font bold = new Font( "Verdana",Font.BOLD ,12 );
    //etiqueta que almacenará el icono a mostrar
    private JLabel label = new JLabel();
    
    public GestionCeldas(){}
    
    public GestionCeldas(String tipo){
        this.tipo=tipo;
    }
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean selected, boolean focused, int row, int column) {
        Color colorFondo = null;
        Color colorFondoPorDefecto=new Color( 192, 192, 192);
        Color colorFondoSeleccion=new Color( 140, 140 , 140);
        if (selected) {                
            this.setBackground(colorFondoPorDefecto );   
        }
        else
        {
        	//Para las que no están seleccionadas se pinta el fondo de las celdas de blanco
            this.setBackground(Color.white);
        }
        
        //definie si el tipo de dato el numerico para personalizarlo
        if( tipo.equals("numerico"))
        {           
            if (focused) {
                    colorFondo=colorFondoSeleccion;
            }else{
                    colorFondo=colorFondoPorDefecto;
            }
        	// System.out.println(value);
            //this.setHorizontalAlignment( JLabel.CENTER ) new Color(32,117,32);
            this.setText( (String) value );            
            this.setForeground( (selected)? new Color(255,255,255) :Color.BLACK );    
            this.setBackground( (selected)? colorFondo :Color.WHITE);
           // this.setBackground( (selected)? colorFondo :Color.MAGENTA);
            this.setFont(bold);            
            return this;   
        }
          return this;
    }
}
