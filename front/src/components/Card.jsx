import "../styles/components/Card.css";

export const Card = () => {
  return (
    <div className="container-card">
      <section className="left">
        <b>Ciudad</b>
        <p>País</p>
      </section>
      <hr />
      <section className="right">
        <p>Clima</p>
        <p>Temperatura</p>
        <p>%Humedad</p>
        <p>%precipitacion</p>
      </section>
    </div>
  );
};
