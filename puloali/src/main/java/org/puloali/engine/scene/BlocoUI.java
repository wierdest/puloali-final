package org.puloali.engine.scene;

import org.joml.Vector3f;
import org.puloali.engine.graph.Model;
import org.puloali.engine.scene.lights.PointLight;

public class BlocoUI {

    private Entity entidadeNuvem;
    private Model modeloNuvem;
    private AnimationData dadosAnimacao;

    public BlocoUI(Scene cena, String id, String path) {

        modeloNuvem = ModelLoader.loadModel(
            "modelo-nuvem-" + id,
            path,
            cena.getTextureCache(),
            true
        );

        cena.addModel(modeloNuvem);

        entidadeNuvem = new Entity("entidade-nuvem-" + id, modeloNuvem.getId());

        entidadeNuvem.setPosition(-1.2f, -0.32f, -2.9f);
        entidadeNuvem.setScale(0.6f);
        entidadeNuvem.setRotation(1, -0.8f, -0.1f, (float)-(Math.PI) / 4);
        // System.out.println("Animações " + modeloNuvem.getAnimationList().size());
        // dadosAnimacao = new AnimationData(modeloNuvem.getAnimationList().get(0));

        entidadeNuvem.updateModelMatrix();
        // System.out.println(modeloNuvem.getAnimationList().get(0).duration() + " " + modeloNuvem.getAnimationList().get(0).name());

        
        
        cena.addEntity(entidadeNuvem);

    }

    public void setNextFrameAnimationData() {
        dadosAnimacao.nextFrame();
    }

    public float getPosicaoY() {
        return entidadeNuvem.getPosition().y;
    }
    public float getPosicaoX() {
        return entidadeNuvem.getPosition().x;
    }
    public float getPosicaoZ() {
        return entidadeNuvem.getPosition().z;
    }


    


}