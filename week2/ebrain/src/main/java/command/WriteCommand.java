package command;

import category.Category;
import category.CategoryDAO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class WriteCommand implements Command{

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        try {
            List<Category> categories = CategoryDAO.getAllCategory();
            request.setAttribute("categories", categories);
            request.getRequestDispatcher("write.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
