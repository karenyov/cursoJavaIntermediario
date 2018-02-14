import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

/**
 * @author Karen 13 de fev de 2018
 */
public class TesteApplet extends Applet {

	private static final long serialVersionUID = 1113866038036531615L;
	private String mensagem;

	@Override
	public void init() {
		mensagem = getParameter("mensagem");
	}

	@Override
	public void paint(Graphics page) {
		page.setColor(Color.RED);
		page.fillRect(0, 0, 50, 50);
		page.setColor(Color.BLUE);
		page.fillRect(50, 0, 50, 50);
		page.setColor(Color.GREEN);
		page.fillRect(0, 50, 50, 50);
		page.setColor(Color.ORANGE);
		page.fillRect(50, 50, 50, 50);
		page.setColor(Color.BLACK);
		page.drawString(mensagem, 10, 40);
	}
}
