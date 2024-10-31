package SDP_5_2;

import SDP_5_2.UserView;
import SDP_5_2.UserViewModel;

public class UserApp {
    public static void main(String[] args) {
        UserViewModel viewModel = new UserViewModel();
        UserView view = new UserView(viewModel);
        view.displayMenu();
    }
}
