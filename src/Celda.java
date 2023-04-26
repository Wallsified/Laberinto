public class Celda {
    private boolean visitada;
    private boolean arriba;
    private boolean abajo;
    private boolean izquierda;
    private boolean derecha;

    public Celda() {
        visitada = false;
        arriba = true;
        abajo = true;
        izquierda = true;
        derecha = true;
    }

    public boolean estaVisitada() {
        return visitada;
    }

    public void marcarComoVisitada() {
        visitada = true;
    }

    public boolean tieneParedArriba() {
        return arriba;
    }

    public boolean tieneParedAbajo() {
        return abajo;
    }

    public boolean tieneParedIzquierda() {
        return izquierda;
    }

    public boolean tieneParedDerecha() {
        return derecha;
    }

    public void eliminarParedArriba() {
        arriba = false;
    }

    public void eliminarParedAbajo() {
        abajo = false;
    }

    public void eliminarParedIzquierda() {
        izquierda = false;
    }

    public void eliminarParedDerecha() {
        derecha = false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        if (arriba) {
            sb.append("↑");
        } else {
            sb.append(" ");
        }
        if (izquierda) {
            sb.append("←");
        } else {
            sb.append(" ");
        }
        if (visitada) {
            sb.append("X");
        } else {
            sb.append(" ");
        }
        if (derecha) {
            sb.append("→");
        } else {
            sb.append(" ");
        }
        if (abajo) {
            sb.append("↓");
        } else {
            sb.append(" ");
        }
        sb.append("]");
        return sb.toString();
    }
}
