# Estructura Spring boot

## Proyecto Srping Boot

    ![image](https://user-images.githubusercontent.com/29387867/152907729-2e4eb2eb-637e-4739-abe4-dd3144151b24.png)

    
    El archivo de configuracion de un proyecto maven es el archivo pomp.xml

    lo principal de lo que se trata un proyecto spring, es que spring boot framework debe tener una etiqueta parent ( <parent> </parent>) en el archivo pomp.xml. Esta etiqueta quiere decir que el padre del proyecto o del cual este se esta heredando (Herencia del proyecto ) de donde se hereda.

    <parent>
        <groupId> Es un proyecto del framework spring boot  </groupId>
        <artifactId> inicializa (Started) el proyecto</artifactId>
        <version> version del spring boot en la que se esta trabajando</version>
        <!-- Esta es la version que se escoge en la pagina start.spring.io -->
    </parent>
