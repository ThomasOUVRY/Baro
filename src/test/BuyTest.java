package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import fonctionnement.Item;
import fonctionnement.User;

class BuyTest {

	@Test
	void test() {
		User user = new User();
		assertTrue(user.getPrixBesoins() ==  0);
		assertTrue(user.getBesoins().isEmpty());
		Item item = new Item(10, "Prisma Grakata");
		user.ajouterItem(item);
		assertEquals(10, user.getPrixBesoins());
	}

}
