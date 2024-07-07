package component;

import meditor.Mediator;

public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}