package woo.app.clients;

import pt.tecnico.po.ui.Command;
import woo.core.StoreManager;

/** Clients menu. */
public class Menu extends pt.tecnico.po.ui.Menu {

  /** @param receiver command executor */
  public Menu(StoreManager receiver) {
    super(Label.TITLE, new Command<?>[] { //
        new DoShowClient(receiver), //
        new DoShowAllClients(receiver), //
        new DoRegisterClient(receiver), //
        new DoToggleProductNotifications(receiver), //
        new DoShowClientTransactions(receiver), //
        new RemoverVendas(receiver), //
    });
  }

}
