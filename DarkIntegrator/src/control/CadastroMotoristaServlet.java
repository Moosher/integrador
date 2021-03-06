package control;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Motorista;
import model.dao.DaoFactory;
import resources.AppConsts;
import resources.GerenciadorData;

@WebServlet( "/CadastroMotoristaServlet" )
public class CadastroMotoristaServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public CadastroMotoristaServlet() {
	super();
    }

    @Override
    protected void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
    }

    @Override
    protected void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
	String nome = request.getParameter( "nome" );
	String dataNascString = request.getParameter( "dataNasc" );
	Date dataNasc = GerenciadorData.getInstance().strToDate(dataNascString);
	String endereco = request.getParameter( "endereco" );;
	char tipoCNH = request.getParameter( "tipoCNH" ).charAt( 0 );
	String cNH = request.getParameter( "CNH" );
	Motorista motorista = new Motorista( nome, dataNasc, endereco, tipoCNH, cNH, true );

	DaoFactory.getDaoFactory().getMotoristaDao().adicionarMotorista( motorista );
	response.sendRedirect( AppConsts.CAMINHO + "/home.jsp?tpcnh=" + tipoCNH );

    }

}
