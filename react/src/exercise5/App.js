import CohortDetails from "./CohortDetails";
import cohorts from "./cohorts";

function Exercise5() {
  return (
    <div>
      {cohorts.map((cohort, index) => (
        <CohortDetails key={index} cohort={cohort} />
      ))}
    </div>
  );
}

export default Exercise5;