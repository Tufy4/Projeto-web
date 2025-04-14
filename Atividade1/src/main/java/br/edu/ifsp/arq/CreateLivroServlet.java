package br.edu.ifsp.arq;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/CreateLivroServlet")
public class CreateLivroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int id=1;
	
       
    
    ArrayList<Livro> livroslista= new ArrayList<Livro>(); 

	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nomeLivro = request.getParameter("nome");//name dos input
		String autor = request.getParameter("autor");
		String anoPub = request.getParameter("ano");
		String generos[] = request.getParameterValues("genero");
		ArrayList<String> lista = new ArrayList<String>();
		
		
		
	    
		
		
		Livro livro = new Livro(id, nomeLivro, autor, generos, anoPub);
		addLivro(livro);
		
		//PARTE DE CRIAR A LISTA E ENVIAR PRA READLIVROSERVLET
		ArrayList<Livro> listaLivros = (ArrayList<Livro>) getServletContext().getAttribute("lista");
		
		if(listaLivros == null) {                   
			listaLivros = new ArrayList<Livro>();	
			 getServletContext().setAttribute("lista", listaLivros);
		}   		
		listaLivros.add(livro);
		
		           
		          
				                                                                 
                                                                             
		String url = "/ReadLivroServlet";                                         
		getServletContext().getRequestDispatcher(url).forward(request, response);
		
		
		
	}
        		                                                                 
	
	
	private void addLivro(Livro livro) {
		livroslista.add(livro);
		attId();
	}
	
	
	private void attId() {
		id +=1;
	}
	
	
	

	
	
	
	
		

}
	
