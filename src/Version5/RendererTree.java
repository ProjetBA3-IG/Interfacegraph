
package Version5;
import java.awt.Component;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeCellRenderer;



class RendererTree extends DefaultTreeCellRenderer {
    
 
		public Component getTreeCellRendererComponent(JTree tree, Object value,	boolean selected, boolean expanded, boolean leaf, int row, boolean hasFocus)
		{
 
			super.getTreeCellRendererComponent(tree, value, selected, expanded, leaf, row, hasFocus);
			//tu pourras modifier des caractéristiques globales, par exemple ici la police
			this.setFont(new Font(this.getFont().getFontName(), Font.PLAIN , 13));
			//ou alors modifier selon si c'est une feuille
			if(leaf)
			{
 
				this.setIcon(new ImageIcon(getClass().getResource("/images/feuille.png")));
				this.setToolTipText("Je suis une feuille");
 
			}
			else if(!expanded)//ou alors si c'est un nœud fermé
			{
				this.setIcon(new ImageIcon(getClass().getResource("/images/dossier_ferme.png")));
			}
			else//ou alors le cas par défaut, donc pas une feuille, ni un dossier fermé ! donc un dossier ouvert...
			{
				this.setIcon(new ImageIcon(getClass().getResource("/images/dossier_ouvert.png")));
			}
 
			return this;
		}
	}