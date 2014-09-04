package twu.exercises.test;

import static org.junit.Assert.*;

import org.junit.Test;

import twu.exercises.ListData;
import twu.exercises.Node;

public class NodeTest {

	@Test
	public void AddTest() {
		
		Node node = new Node("A");
		String esperado = "A";
		assertNotNull(node);
		assertTrue("Esperado: " + esperado + ". Obtido: " + node.getConteudo() + ".",node.getConteudo().equals("A"));
		
	}
	
	@Test
	public void findLastNodeTest(){
		
		ListData listData = new ListData();
		
		listData.add(new Node("B"));
		listData.add(new Node("V"));
		listData.add(new Node("M"));
		
		Node node = ListData.findLastNode();
		
		assertNull(node.getProximo());
		
	}

}
