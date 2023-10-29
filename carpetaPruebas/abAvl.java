package carpetaPruebas;

public class abAvl<AnyType> {
    nodoAvl<AnyType> root;

    abAvl()  //Creacion del arbol vacio.
    {
        root = null;
    }

    abAvl(AnyType element) //Creacion del arbol con root y element.
    {
        root = new nodoAvl<AnyType>(element,null,null);
    }

    public void printInOrder()
    {
        printInOrderPrivate(root);
    }

    private void printInOrderPrivate(nodoAvl<AnyType> root)
    {
        if(root.left != null)
        {
            System.out.println("\t");
            printInOrderPrivate(root.left);
        }
        System.out.println("\t" + root.element);
        if(root.right!=null)
        {
            System.out.println("\t");
            printInOrderPrivate(root.right);
        }
    }

    public void insertarAvl(AnyType element) //Insertar el nuevo elemento, y luego de insertarlo equilibrar el arbol
    {
        insertar(element, root);
        equilibrioAvl();
    }

    private void insertar(AnyType element, nodoAvl<AnyType> root)
    {

        if( (int) element < (int) root.element)
        {
            if(root.left == null)
            {
                root.left = new nodoAvl(element,null,null);
            }
            else
            {
                insertar(element, root.left);
            }
        }
        else
        {
            if((int) element > (int) root.element)
            {
                if(root.right == null)
                {
                    root.right = new nodoAvl(element,null,null);
                }
                else
                {
                    insertar(element, root.right);
                }
            }
        }
    }

    private void equilibrioAvl()
    {

    }
}
